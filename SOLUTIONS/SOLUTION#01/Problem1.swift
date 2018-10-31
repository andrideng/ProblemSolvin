import Foundation 

func whereAmI(array arr: [String], position p: Int ) -> String {
    return arr[(p-1)%arr.count]
}

func whereAmI(array arr: [String], queries q: [Int]) -> [String] {
    return q.map {whereAmI(array: arr, position: $0)}
} 

print(whereAmI(array: ["Bhin Bhin", "Atung", "Kaka", "Hodori", "Pan Pan", "Appu", "Lulu", "Orry", "Mei Mei"], queries: [5, 3, 13, 20, 28]))
