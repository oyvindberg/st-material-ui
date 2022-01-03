package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellClassesMod {
  
  @JSImport("@mui/material/TableCell/tableCellClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableCell/tableCellClasses", JSImport.Default)
  @js.native
  val default: TableCellClasses = js.native
  
  @scala.inline
  def getTableCellUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableCellUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.head
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.body
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.footer
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paddingCheckbox
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paddingNone
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignLeft
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignCenter
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignRight
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignJustify
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.stickyHeader
  */
  trait TableCellClassKey extends StObject
  
  @js.native
  trait TableCellClasses extends StObject {
    
    /** Styles applied to the root element if `align="center"`. */
    var alignCenter: String = js.native
    
    /** Styles applied to the root element if `align="justify"`. */
    var alignJustify: String = js.native
    
    /** Styles applied to the root element if `align="left"`. */
    var alignLeft: String = js.native
    
    /** Styles applied to the root element if `align="right"`. */
    var alignRight: String = js.native
    
    /** Styles applied to the root element if `variant="body"` or `context.table.body`. */
    var body: String = js.native
    
    /** Styles applied to the root element if `variant="footer"` or `context.table.footer`. */
    var footer: String = js.native
    
    /** Styles applied to the root element if `variant="head"` or `context.table.head`. */
    var head: String = js.native
    
    /** Styles applied to the root element if `padding="checkbox"`. */
    var paddingCheckbox: String = js.native
    
    /** Styles applied to the root element if `padding="none"`. */
    var paddingNone: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** Styles applied to the root element if `context.table.stickyHeader={true}`. */
    var stickyHeader: String = js.native
  }
  object TableCellClasses {
    
    @scala.inline
    def apply(
      alignCenter: String,
      alignJustify: String,
      alignLeft: String,
      alignRight: String,
      body: String,
      footer: String,
      head: String,
      paddingCheckbox: String,
      paddingNone: String,
      root: String,
      sizeMedium: String,
      sizeSmall: String,
      stickyHeader: String
    ): TableCellClasses = {
      val __obj = js.Dynamic.literal(alignCenter = alignCenter.asInstanceOf[js.Any], alignJustify = alignJustify.asInstanceOf[js.Any], alignLeft = alignLeft.asInstanceOf[js.Any], alignRight = alignRight.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], paddingCheckbox = paddingCheckbox.asInstanceOf[js.Any], paddingNone = paddingNone.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], stickyHeader = stickyHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableCellClasses]
    }
    
    @scala.inline
    implicit class TableCellClassesMutableBuilder[Self <: TableCellClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignCenter(value: String): Self = StObject.set(x, "alignCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignJustify(value: String): Self = StObject.set(x, "alignJustify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignLeft(value: String): Self = StObject.set(x, "alignLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignRight(value: String): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingCheckbox(value: String): Self = StObject.set(x, "paddingCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingNone(value: String): Self = StObject.set(x, "paddingNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    }
  }
}
