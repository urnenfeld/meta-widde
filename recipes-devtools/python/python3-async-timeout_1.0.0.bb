SUMMARY = "asyncio-compatible timeout context manager"
HOMEPAGE = "https://github.com/aio-libs/multidict/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRCNAME = "async_timeout"
S = "${WORKDIR}/${SRCNAME}-${PV}"

SRC_URI = "https://pypi.python.org/packages/c3/5b/d00e06296f5fe2c1db230f5f3f39538a4ae23c153adb1672e87e94137f89/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "f8baef770792f04fa3d74e7d083c43e9"
SRC_URI[sha256sum] = "c7afd7355b93fca0aecc15811aa53eea57f6fd7307b5bff2336b01419ebeda36"

inherit setuptools3

