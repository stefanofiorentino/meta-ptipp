SUMMARY = "A PTI (sub-pressure sensor/actuator by Brooks) monitor image."

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "openssh"
IMAGE_INSTALL += "ptipp"
IMAGE_INSTALL += "git"
IMAGE_INSTALL += "python"
IMAGE_INSTALL += "connman-tools"
IMAGE_INSTALL += "connman-client"
IMAGE_INSTALL += "make"
IMAGE_INSTALL += "gcc"

BBCLASSEXTEND += "native nativesdk"
