SUMMARY = "http client/server for asyncio"
HOMEPAGE = "https://github.com/KeepSafe/aiohttp/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d4ae7def6b740abc020a2700493fef4e"

SRC_URI[md5sum] = "488026a1c1e716741842403b7b9f030a"
SRC_URI[sha256sum] = "c3e1897726f97d40e067e8b658b2dbdfe216f32b801c5c589212e1b1f9aa8388"

# kogroth will only fetch in pypi
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/source/a/aiohttp/aiohttp-${PV}.tar.gz"

inherit pypi setuptools3

RDEPENDS_${PN} = "\
  ${PYTHON_PN}-chardet \
  ${PYTHON_PN}-multidict \
"

