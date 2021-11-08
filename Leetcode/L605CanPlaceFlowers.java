class L605CanPlaceFlowers {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int validEmptySpaces=0, size=flowerbed.length;
        if(size == 1 && flowerbed[0] == 0){
            return true;
        }
        int i=0;
        while(i < size && n > 0){
            if(i == 0 && i+1<size && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                //flowerbed[i] = 1;
                n -= (1 - flowerbed[i]);
                i+=2;
            } else if(i == size-1 && i-1>=0 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
                n -= (1 - flowerbed[i]);
                i+=2;
            } else if(i-1>=0 && i+1< size && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                n -= (1 - flowerbed[i]);
                i+=2;
            } else {
                i++;
            }
        }
        return n <= 0;
        /*for(int i=0; i<size; i++){
            if(i == 0 && i+1<size && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                validEmptySpaces++;
            } else if(i == size-1 && i-1>=0 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
                flowerbed[i] = 1;
                validEmptySpaces++;
            } else if(i-1>=0 && i+1< size && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                validEmptySpaces++;
            }
            if(validEmptySpaces >= n){
                return true;
            }
        }
        return n<=validEmptySpaces;*/
    }
}