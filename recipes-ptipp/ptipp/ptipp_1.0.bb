#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "sm1/pti - MKS Pressure Technology Industries"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=838c366f69b72c5df05c96dff79b35f2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Use local tarball
SRC_URI = "file://ptipp-${PV}.tar.gz"
S = "${WORKDIR}/ptipp-${PV}"

PACKAGES = "${PN} ${PN}-dev ${PN}-dbg ${PN}-staticdev"

COMPATIBLE_MACHINE = "nanopi-neo"

inherit cmake

DEPENDS = "sm1cpp"
RDEPENDS_${PN} = "sm1cpp"

BBCLASSEXTEND += "native nativesdk"

PARALLEL_MAKE = ""
