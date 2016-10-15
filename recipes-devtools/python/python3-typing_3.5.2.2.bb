DESCRIPTION = "Type Hints for Python"
SECTION = "devel/python"

LICENSE = "MIT"

S = "${WORKDIR}/${SRCNAME}-${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

SRCNAME = "typing"

inherit setuptools3

SRC_URI = "https://pypi.python.org/packages/19/2f/b1090ace275335a9c0dde9a4623b109b7960a2b5370ae59d1eb1539afd8a/typing-3.5.2.2.tar.gz"
SRC_URI[md5sum] = "61ffbe736df9f419563dbfffa64ebb7d"
SRC_URI[sha256sum] = "2bce34292653af712963c877f3085250a336738e64f99048d1b8509bebc4772f"


