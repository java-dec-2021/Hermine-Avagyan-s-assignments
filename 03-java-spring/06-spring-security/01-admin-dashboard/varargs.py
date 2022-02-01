class MathDojo:
    def __init__(self):
        self.result = 0
    def add(self, num, * nums):
        self.result += num
        for i in nums:
            self.result += i
        return self  
    
    
    def subtract(self, num, * nums):
        self.result -= num
        for i in nums:
            self.result -= i
        return self
        
md = MathDojo()
#print (md.subtract(9,3,2,4).add(2,3).subtract(2,1).result)
#print (md.add(10,4,3,5).add(2).subtract(6,4).add(2,1).result)
# print()
print (md.add(2,3).subtract(11,2,3).subtract(2,1).result)
# print()
# print(md.add(3).add(2,3).add(3,4).result)
