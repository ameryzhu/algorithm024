class Solution{

    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuilder buider = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].trim().equals("")) {
                continue;
            } else {
                if (i != 0) {
                    buider.append(strings[i].trim() + " ");
                } else {
                    buider.append(strings[i].trim());
                }
            }
        }
        return buider.toString();
    }
}
