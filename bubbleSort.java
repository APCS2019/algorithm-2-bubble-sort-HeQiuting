int[] a = {5,3,1,6,9,3};
int n = a.length;
while(n > 0) {
  for(int i = 0; i < n - 1; i++) {
    if(a[i] > a[i+1]) {
      int tmp = a[i];
      a[i] = a[i+1];
      a[i+1] = tmp;
    }
  }
  n--;
  }
