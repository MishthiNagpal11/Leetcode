class Solution(object):
    def binaryGap(self, n):
        position=0
        previous=-1
        max_gap=0
        while n>0:
            if n%2==1:
                if previous!=-1:
                    max_gap=max(max_gap,position-previous)
                previous=position
            n//=2
            position+=1
        
        return max_gap
        