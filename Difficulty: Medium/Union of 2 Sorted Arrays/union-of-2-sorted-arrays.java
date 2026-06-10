class Solution {
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0, j = 0;
		int n = a.length, m = b.length;
		
		while (i < n && j < m) {
			if (a[i] == b[j]) {
				if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
					ans.add(a[i]);
				}
				
				int val = a[i];
				while (i < n && a[i] == val)
					i++;
				while (j < m && b[j] == val)
					j++;
			}
			else if (a[i] < b[j]) {
				if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
					ans.add(a[i]);
				}
				
				int val = a[i];
				while (i < n && a[i] == val)
					i++;
			}
			else {
				if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
					ans.add(b[j]);
				}
				
				int val = b[j];
				while (j < m && b[j] == val)
					j++;
			}
		}
		
		while (i < n) {
			if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
				ans.add(a[i]);
			}
			
			int val = a[i];
			while (i < n && a[i] == val)
				i++;
		}
		
		while (j < m) {
			if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
				ans.add(b[j]);
			}
			
			int val = b[j];
			while (j < m && b[j] == val)
				j++;
		}
		
		return ans;
		
	}
}
