#	Mandatory 5: Edit kelas IdnCurrRates menjadi kelas Singleton
#	Mandatory 6: Edit kelas IdnCurrRates agar bisa dijalankan dengan kelas Borg
class IdnCurrRates (object):
	def __init__(self,rates):
		self.rates = rates
	def __str__(self):
		return str(self.rates)

#	Mandatory 6: Buat kelas Borg lalu buat kelas SgprCurrRates yang mirip dengan kelas IdnCurrRates

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
print ('Kondisi x dan y seharusnya menjadi 30000')
print ('Rates x: '+ str(x))
print ('Rates y: ' + str(y))

# Kode di bawah untuk Mandatory 6
# e = SgprCurrRates(40000)
# print ('Rates x: '+ str(e))
# f = SgprCurrRates(50000)
# print ('Rates y: ' + str(f))
# g = SgprCurrRates(60000)
# print ('Rates z: ' + str(g))
# print ('Kondisi e dan f seharusnya menjadi 60000')
# print ('Rates e: '+ str(e))
# print ('Rates f: ' + str(f))
