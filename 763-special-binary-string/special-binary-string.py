class Solution(object):
    def makeLargestSpecial(self, s):
        """
        :type s: str
        :rtype: str
        """
        if not s:
            return ""
        
        count = 0
        start = 0
        substrings = []
        
        for i in range(len(s)):
            if s[i] == '1':
                count += 1
            else:
                count -= 1
            
            # When count becomes 0 → found a special substring
            if count == 0:
                # Recursively process the inner substring
                inner = self.makeLargestSpecial(s[start + 1:i])
                substrings.append("1" + inner + "0")
                start = i + 1
        
        # Sort in descending lexicographical order
        substrings.sort(reverse=True)
        
        return "".join(substrings)
        