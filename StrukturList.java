package Pertemuan6;

public class StrukturList {
    private Node HEAD;
	
	//add head (menambahkan node di awal list)
	public void addHead(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			HEAD = newNode;
		}else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}

    private boolean isEmpty() {
		return HEAD == null;
	}
	
	//add mid (menyelipkan node di tengah tengah list)
	public void addMid(int data, int position) {
		Node newNode = new Node(data);
		Node curNode = null;
		Node posNode = null;
		int i;
		
		if(isEmpty()) {
			HEAD = newNode;
		}else {
			curNode = HEAD;
			if(position == 1) {
				newNode.setNext(curNode);
				HEAD = newNode;
			}else {
				i = 1;
				while((curNode != null)&&(i < position)) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		}
	}
	
	//add tail (menambahkan node di akhir list)
	public void addTail(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			Node posNode = null;
			Node curNode = HEAD;
			
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
		}
	}

    //delete head
    public void removeHead(){
           if(isEmpty()){
            System.out.println("List Kosong");
        }else{
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }
	
    //fungsi dispose
    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    //remove tail
    public void removeTail(){
        Node preNode = null;
        Node lastNode;

        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    //remove mid
    public void removeMid(int e){
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if(isEmpty()){
            System.out.println("List Kosong");
        }else{
            ketemu = false;
            i = 1;
            tempNode = HEAD;

            while(tempNode.getNext() != null && !ketemu){
                if(tempNode.getData() == e){
                    ketemu = true;
                }else{
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
            
            if(ketemu == true){
                if(i == 1){
                    HEAD = null;
                }else{
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    //remove all
    void removeAll(){
        HEAD = null;
        //ketika head bernilai null maka list tidak akan memiliki kelanjutannya
    }

    //operasi find
    public boolean find(int x){
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu){
            /*
             * ketika curNode tidak sama dengan null dan tidak ketemu maka akan mencari
             */
            if(curNode.getData() == x )
            ketemu = true;
            /*
             * ketika curnode = x maka akan return ketemu = true
             */
            else
            curNode = curNode.getNext();
            /*
             * kalau tidak sama maka akan ke value selanjutnya untuk
             * mencari value yang sama dengan x
             */
        }
        return ketemu;
    }

    //operasi size
    public int size(){
        Node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
            /*
             * tiap curnode akan menambahkan jumlah dengan 1
             * sehingga pada akhir node, jumlah akan sesuai dengan jumlah node
             */
        }
        return jumlah;
    }

	public void displayElement() { //untuk menampilkan hasil ke layar
		Node curNode = HEAD;
		
        if(curNode == null){
            System.out.println("\n List Kosong");
        }
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}
}
