#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "sm1/pti - MKS Pressure Technology Industries"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

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
