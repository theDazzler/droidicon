__author__ = 'zweicmu@gmail.com'

import urllib2
import re

FONT_AWESOME_CODE_URL = "https://github.com/FortAwesome/Font-Awesome/raw/master/css/font-awesome.css"
REGEX_TO_GET_ICON_NAME_AND_CODE = r'[.](fa-[^:]+):before\s+[{]\s+content:\s+["]\\([^"]+)'

def read_font_awesome_raw_code():
  try:
    return urllib2.urlopen(FONT_AWESOME_CODE_URL).read()
  except urllib2.URLError as e:
    print "URLError ({0}): {1}".format(e.errno, e.strerror)
    return None

raw_code = read_font_awesome_raw_code()
if raw_code:
  count = 0
  for match in re.finditer(REGEX_TO_GET_ICON_NAME_AND_CODE, raw_code):
    #print 'name : %s , code : %s' % (match.group(1), match.group(2))
    print 'fontAwesomeIconMap.put("%s", 0x%s);' % (match.group(1), match.group(2))
    count += 1

  print "parsed %s icons" % count