import cv2

img = cv2.imread("iu.jpg")
dstImage = cv2.resize(img, (256, 256))
dstImage2 = cv2.cvtColor(img, cv2.COLOR_RGB2GRAY)
cv2.imshow("iu", img)
cv2.imshow("iu resize", dstImage)
cv2.imshow("iu GrayScale", dstImage2)
cv2.waitKey(0)
cv2.destroyAllWindows()