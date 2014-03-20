/**Note added by Aj: 
  Hashing creates a problem as of Feb 14th 2014. Two words get the same hashcode, so one word gets overwritten.
  Add some better code for the hashing function to fix the issue
  Currently the hashCode is just the s.hashCode() % size
  Write your own implementation of the hashCode function to get a better hashCode. **/


/**
* An interface describing a dictionary of strings.
* The dictionary cannot contain duplicate strings.
* @version 2012-12-14
*/
public interface StringDictionary { 
/**
* Adds the given string to this table.
* Returns <code>true</code> if the dictionary
* did not already contain the given string.
*
* Complexity: O(1) expected time.
*/
public boolean add(String s);
/**
* Removes the given string from this dictionary
* if it is present. Returns <code>true</code> if
* the dictionay contained the specified element.
*
* Complexity: O(1) expected time.
*/
public boolean remove(String s);
/**
* Returns <code>true</code> if the string is
* in this dictionary.
*
* Complexity: O(1) expected time.
*/
public boolean contains(String s);
}