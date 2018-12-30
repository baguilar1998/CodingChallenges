class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> answers = new ArrayList<Integer>();
        for(int i=left;i<=right;++i){
            int tempNumber = i;
            int mod = 0;
            while(tempNumber!=0){
                mod = tempNumber%10;
                tempNumber/=10;
                if(mod==0) break;
                if(i%mod!=0)break;
                
            }
            if(tempNumber == 0 && i%mod==0) answers.add(i);
        }
        return answers;
    }
}