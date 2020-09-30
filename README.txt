TestList.java:

list.remove(5) removes an element with index 5. In this case it is 77.

list.remove(Integer.valueOf(5)) removes a first occurance of value 5 
from the list.

All the tests pass no matter which list is used: ArrayList or LinkedList.



TestIterator.java:

If list.remove(77) is used, than a runtime error occurs.
The size of the list is 7, so index 77 is out of range.

All the tests pass no matter which list is used: ArrayList or LinkedList.



TestPrformance.java:


Running times for SIZE = 10:

ArrayList:
	testArrayListAccess() 		0.015
	testArrayListAddRemove()	0.078
LinkedList:
	testLinkedListAccess()		0.028
	testLinkedListAddRemove() 	0.172
	


Running times for SIZE = 100:

ArrayList:
	testArrayListAccess() 		0.018
	testArrayListAddRemove()	0.159
LinkedList:	
	testLinkedListAccess()		0.056
	testLinkedListAddRemove() 	0.105


Running times for SIZE = 1000:

ArrayList:
	testArrayListAccess() 		0.037
	testArrayListAddRemove()	0.785
LinkedList:	
	testLinkedListAccess()		0.949
	testLinkedListAddRemove() 	0.102


Running times for SIZE = 10000:

ArrayList:
	testArrayListAccess() 		0.024
	testArrayListAddRemove()	8.135
LinkedList:	
	testLinkedListAccess()		9.404
	testLinkedListAddRemove() 	0.097


Performance Summary:
ArrayList is good with accessing its elements. The time of this operation 
remains almost the same for all of the values of SIZE. However, time of 
add and remove operations increases with SIZE for ArrayList.
LinkedList performs better with add and remove operations as time remains 
almost the same with incresing of SIZE. However, time for accessing elements
within LinkedList increses along with SIZE but if we are accessing the head node then time remains constant.
