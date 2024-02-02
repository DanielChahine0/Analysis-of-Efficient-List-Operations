# Sorting Hocky Pucks Problem

#### The variables used in this solution are split into 3 parts. The start, the buffer, and the exit.
```
Queue start = new Queue();
Stack buffer = new Stack();
Stack exit = new Stack();
```

The start array, and the exit are of type queue, as the pucks should go in a First In First Out (FIFO) order. As for the buffer, it is made into a stack since it requires property that will allow them to go in a specific order (First In Last Out - FILO).


```
    	
    	
    	for (Integer item: arr) {
    		start.push(item);
    	}
    	
    	int counter = 1;
    	
    	while(!start.isEmpty() || !buffer.isEmpty()) {
    		if (start.peek()!=null && start.peek()==counter) {
    			exit.push(start.pop());
    			counter++;
    		}
    		else if(buffer.peek()!=null && buffer.peek()==counter) {
    			exit.push(buffer.pop());
    			counter++;
    		}
    		else if (start.peek()!=null){
    			buffer.push(start.pop());
    		}
    		else {
    			break;
    		}
    		
    	}
```

asdfasdf
as
f
asdf
a
sfd
as
f
asdf
as
fd
asf
as
f
asfd
as
f
asf
as
fd
asf
asf

asd
fa
sf
as
f