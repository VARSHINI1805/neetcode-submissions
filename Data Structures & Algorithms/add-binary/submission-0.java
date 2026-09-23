class Solution {
    public String addBinary(String a, String b) {

        java.math.BigInteger x = new java.math.BigInteger(a, 2);
        java.math.BigInteger y = new java.math.BigInteger(b, 2);
        return x.add(y).toString(2);
    }
}