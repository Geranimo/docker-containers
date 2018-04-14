<!-- Build an image with given tag -->
docker build -t sabarishsash/alpine-upgraded:1.0 . 

<!-- Create a container with the given image -->
docker run -ti --rm sabarishsash/alpine-upgraded:1.0