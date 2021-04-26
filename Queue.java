package cpsc281;
public interface Queue<E> {
  /**
   * Constructs a queue with default capacity of 4.
*/
public Queue();
/**
 * Constructs a queue with size capacity.
 */
public Queue(Integer capacity);
/**
 * Inserts an element into the Queue.
 *
 * @param element The element to insert.
*/
public boolean insert(E element);
/**
 * Retrieve the current element from the Queue. Does not
 * modify the queue.
*
 * @return The current element in the queue.
 */
public E peek(); /**
* Remove and return the current element from the Queue. * Modifies the queue.
*
* @return The current element in the Queue.
*/
public E remove();
/**
 * Returns the current capacity of the Queue
 *
 * @return int - The capacity of the Queue
 */
 public int getCapacity();
/**
 * Returns the current size of the Queue
 *
* @return int - The current size of the Queue
*/
public int getSize(); /**
* Clears all elements from the queue.
*/
public void clear();
/**
 * Returns a String representation of the queue.
*
   * @return The string version of the queue.
   */
public String toString(); }