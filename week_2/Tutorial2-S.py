#	Mandatory 9: Edit IdnCurrRates class to a Singleton class
#	Mandatory 10: Edit IdnCurrRates class to be able to run with Borg class
class IdnCurrRates (object):
	def __init__(self,rates):
		self.rates = rates
	def __str__(self):
		return str(self.rates)

#	Mandatory 10: Create Borg class then create SgprCurrRates class that has the same method as IdnCurrRates

#class Borg:
#Implemented in here

#class SgprCurrRates(object):
#implemented in here
		
x = IdnCurrRates(10000)
print ('Rates x: '+ str(x))
y = IdnCurrRates(20000)
print ('Rates y: ' + str(y))
z = IdnCurrRates(30000)
print ('Rates z: ' + str(z))
print ('X and Y condition should be 30000')
print ('Rates x: '+ str(x))
print ('Rates y: ' + str(y))

# Below are codes for Mandatory 10
# e = SgprCurrRates(40000)
# print ('Rates x: '+ str(e))
# f = SgprCurrRates(50000)
# print ('Rates y: ' + str(f))
# g = SgprCurrRates(60000)
# print ('Rates z: ' + str(g))
# print ('E and F condition should be 60000')
# print ('Rates e: '+ str(e))
# print ('Rates f: ' + str(f))
