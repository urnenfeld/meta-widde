DESCRIPTION = "Voluptuous is a Python data validation library"
SECTION = "devel/python"

LICENSE = "MIT"

S = "${WORKDIR}/${SRCNAME}-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=9855ba150f2edb00d8e7a41554896ffb"

SRCNAME = "voluptuous"

inherit setuptools3

SRC_URI="https://pypi.python.org/packages/4a/f8/82762db7c28d36800052a61ce26a9c8d362d765aff1c5ce8cb6a01418b7a/voluptuous-0.9.2.tar.gz"
SRC_URI[md5sum] = "bb27287ac1e51c972aa9ba911af846d4"
SRC_URI[sha256sum] = "01f21a3168a911551cbf89373763273189cb84196f0c7a5c0b86bd48c01f8d8b"


