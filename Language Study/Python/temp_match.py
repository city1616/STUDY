import numpy as np
import matplotlib.image as img

path = "/Users/seungwoomun/Documents/Study/Python/testData/"
trainData = np.zeros((20*16, 8))
meanData = np.zeros((20*16, 10))

for i in range(0, 10):
    for j in range(1, 8):
        fn = path + "digit%d_%d.bmp" % (i, j)
        xi = img.imread(fn)
        x = xi[:, :, 0].reshape(16*20)/255
        trainData[:, j] = x
    meanData[:, i] = np.mean(trainData, 1)

k = input("파일명을 입력하세요 : ")
fn = path + k
x = img.imread(fn)
data = x[:, :, 0].reshape(16*20)/255

distArray = []

for i in range(0, 10):
    dist = np.linalg.norm(meanData[:, i] - data)
    distArray.append(dist)

minVal = distArray.index(min(distArray))

print("입력한 데이터는 %d 입니다." % (minVal))