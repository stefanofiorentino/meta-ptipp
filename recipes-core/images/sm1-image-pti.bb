SUMMARY = "A PTI (sub-pressure sensor/actuator by Brooks) monitor image."

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "openssh"
CORE_IMAGE_EXTRA_INSTALL += "ptipp"
CORE_IMAGE_EXTRA_INSTALL += "git"
CORE_IMAGE_EXTRA_INSTALL += "python"
CORE_IMAGE_EXTRA_INSTALL += "connman"

BBCLASSEXTEND += "native nativesdk"
