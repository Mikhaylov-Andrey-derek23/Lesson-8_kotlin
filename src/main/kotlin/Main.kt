import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.TreeMap
import java.util.TreeSet

fun main(args: Array<String>) {
//    classWork()
    homeWork()
}
fun classWork(){
    println("Колекция (Set, List, Map)");

    val listPfNumbers = listOf(1,2,3);
    val secondListOfNumbers = listOf<Any>(5, 6,9, "566565", "green");
    val thirdLostOfNumbers = List<Int>(6, {index -> index+3})
    val array = arrayOf(5, 7, 8);
    val mutablelListOfNumbers = mutableListOf(1, 5, 7);
    val secondMutableListOfNumbers: MutableList<Int> = mutableListOf(5, 998, 56);

    println(array.toString())
    println(mutablelListOfNumbers.toString());
    mutablelListOfNumbers.add(0, 78);
    println(mutablelListOfNumbers.toString());
    mutablelListOfNumbers.remove(7)
    println(mutablelListOfNumbers.toString());
    mutablelListOfNumbers.removeAt(0)
    println(mutablelListOfNumbers.toString());
    mutablelListOfNumbers.remove(1)
    mutablelListOfNumbers.remove(5)
    println(mutablelListOfNumbers.toString())

    val firstSet = setOf(1, 3,3,4)
    println(firstSet.toString())
    println(firstSet.size)
    val mutableSet = mutableSetOf(1, 2, 5, 6);
    println(mutableSet.toString());
    mutableSet.add(4);
    mutableSet.add(3);
    println(mutableSet.toString());

    //Словари
    val map = mapOf(Pair("key1", 5), Pair("key2", 2), Pair("key3", 7));
    println(map.toString());
    val mutableMap = mutableMapOf(Pair(0, 5), Pair(1, 2), Pair(2, 7));
    mutableMap.put(3, 85)
    mutableMap[0] = 0
    println(mutableMap.toString())
    mutableMap.put(11, 22)
    mutableMap.put(11, 202)
    println(mutableMap);
    mutableMap.remove(11)
    println(mutableMap);

    val secondArray = arrayOf(Pair(4, 788), Pair(5, 856), Pair(6, 7254));
    mutableMap.putAll(secondArray);
    println(mutableMap)
    mutableMap[6] = 2
    println(mutableMap)
    println(secondArray.contentToString());

    val arrayList = arrayListOf("dog", "cat", "mouse", "rabbit");
    arrayList.add("raiven");
    println(arrayList);
    arrayList.remove("raiven");
    println(arrayList);

    val arrayLinkedList = LinkedList<String>(listOf("D", "B", "C"))
    println(arrayLinkedList)
    arrayLinkedList.add("A")
    println(arrayLinkedList)
    arrayLinkedList.remove()
    println(arrayLinkedList)
    arrayLinkedList.remove("C")
    println(arrayLinkedList);
    arrayLinkedList.removeAt(0)
    println(arrayLinkedList);
    println(arrayLinkedList[0])

    //0(1) одна операция
    //O(n) количество элементов n

    val hasSet = hashSetOf(2, 5, 7)
    hasSet.add(10);
    hasSet.add(3)
    println(hasSet)
    hasSet.remove(10)
    println(hasSet)

    val treeSet: TreeSet<Int> = TreeSet(setOf(2,5, 78, 23, 1, 6))
    println(treeSet)
    treeSet.add(4)
    println(treeSet);
    treeSet.remove(2)
    println(treeSet);

    val hasMap = hashMapOf(Pair("user1", "Bob"), Pair("z", "Great Bob"), Pair("user3", "David"));
    hasMap.put("user4", "Peter");
    hasMap["user1"] = "Great Bob22";
    println(hasMap)
    hasMap.remove("user3")
    println(hasMap);

    val treeMap = TreeMap(mapOf(Pair(0, 5),Pair(23, 0), Pair(1, 5)));
    println(treeMap)
    treeMap[1] = 0
    treeMap.remove(0)
    println(treeMap)
}

fun homeWork(){
    val arrayDouble = arrayListOf( arrayListOf(1,2), arrayListOf(3,4))
    for(element in arrayDouble){
        println("Element")
        for(el in element){
            println(el)
        }
    }


    val myMap1 = WorkingInObject(mapOf(Pair("first", 1))).getInfo()
    val myMap2 = WorkingInObject(setOf("2", "5", "6")).getInfo()
    val myMap3 = WorkingInObject(LinkedList(listOf(5, 6, 7))).getInfo()
    val myMap4 = WorkingInObject(ArrayList(listOf(5, 6, 7))).getInfo()
    val number = WorkingInObject(5).getInfo()


}

class WorkingInObject (_object:Any){
    private val myObject = _object

    private val mapTypeObject =  mapOf(
        Pair(
            "java.util.Collections\$SingletonMap",
            "This is dictionary"
        ),
        Pair(
            "java.util.LinkedHashSet",
            "This is array with unique values"
        ),
        Pair(
          "java.util.LinkedList",
          "This is array with sorted values"

        ),
        Pair(
            "java.util.ArrayList",
            "This is simple array"
        )
    )

    fun getInfo(){
        println("------------------\n")
        val key = myObject::class.java.typeName.toString()
        if(mapTypeObject.containsKey(key)){
            println(myObject)
            println(mapTypeObject[key])

        }else{
            println("Type is not map $key")
        }

    }

}