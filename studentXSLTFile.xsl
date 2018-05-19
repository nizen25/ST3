<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : newstylesheet.xsl
    Created on : 15 May 2018, 11:13 PM
    Author     : sydney
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:apply-templates select="student"/>
    </xsl:template>

    <xsl:template match="student">
        <learner>
            <id><xsl:value-of select="id"/></id>
            <firstName><xsl:value-of select="name"/></firstName>
            <lastName><xsl:value-of select="surname"/></lastName>
            <xsl:apply-templates select="address"/>
        </learner>
    </xsl:template>
    <xsl:template match="address">
        <address>
            <street><xsl:value-of select="street"/></street>
            <area><xsl:value-of select="location"/></area>
            <areaCode><xsl:value-of select="code"/></areaCode>
        </address>
    </xsl:template>
</xsl:stylesheet>

