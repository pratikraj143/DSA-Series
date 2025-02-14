class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student=new LinkedList<>();
        Stack<Integer> sandwiche= new Stack<>();
        int count=0;
        for(int i=0;i<students.length;i++){
            student.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            sandwiche.push(sandwiches[i]);
        }
        while(!student.isEmpty()){ 
            if(student.peek()==sandwiche.peek()){
                student.remove();
                sandwiche.pop();
                count=0;
            }
            else{
                int n=student.size(); 
                count++;
                student.add(student.remove());
                if(count==n){
                    break;
                }
            }
           
        }
       return student.size();
    }
}