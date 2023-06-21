quasiXML
====

A DFDL Schema for "quasi-XML"

Quasi-XML is the term for data that looks like XML, but doesn't really follow XML syntax rules fully.
Such data cannot be read by an XML parser. 

For example, such data may have ```<foo>....</foo>``` tags to start and end various data items, but the
simple content strings inside the tags may not have proper escaping of XML-restricted characters.
Characters that are just plain disallowed in XML may be in the data (like ASCII NUL).

Here's a small example:

    <post>This is 'some data' that has < and > characters that can't appear in XML literally.</post>

This is not legal XML. It must be:

    <post>This is &apos;some data&apos; that has &lt; and > characters that can&apos;t appear in XML literally.</post>
   
This kind of data arises easily if the data is output from programs using print statements to output tags
surrounding other data strings. Those data strings aren't typically being filtered for proper quoting or illegal
characters for XML. So what one gets is only "quasi-XML". 

This schema parses example Quasi-XML data creating "real" XML output.


