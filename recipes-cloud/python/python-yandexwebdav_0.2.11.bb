DESCRIPTION = "Simple wrapper to work with yandex disk using webdav Basic Auth."
# Other references https://365-on.com/%D0%BE%D1%82%D0%BF%D1%80%D0%B0%D0%B2%D0%BA%D0%B0-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0-%D1%81-%D0%BF%D0%BE%D0%BC%D0%BE%D1%89%D1%8C%D1%8E-curl-%D0%BD%D0%B0-yandex-disk/


HOMEPAGE = "https://github.com/lexich/yandex-disk-webdav"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRCNAME = "yandexwebdav"

SRC_URI = "http://pypi.python.org/packages/source/y/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "18223432c09f9d26c7f47413737fec9f"
SRC_URI[sha256sum] = "712166290fc412f01c7e665896072ec2e540285d747013209d62a71c55a27739"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-six"

