package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellTableCellClassesMod {
  
  @JSImport("@mui/material/TableCell/tableCellClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableCell/tableCellClasses", JSImport.Default)
  @js.native
  val default: TableCellClasses = js.native
  
  inline def getTableCellUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableCellUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableCellClassKey = "root" | "head" | "body" | "footer" | "sizeSmall" | "sizeMedium" | "paddingCheckbox" | "paddingNone" | "alignLeft" | "alignCenter" | "alignRight" | "alignJustify" | "stickyHeader"
  
  trait TableCellClasses extends StObject {
    
    /** Styles applied to the root element if `align="center"`. */
    var alignCenter: String
    
    /** Styles applied to the root element if `align="justify"`. */
    var alignJustify: String
    
    /** Styles applied to the root element if `align="left"`. */
    var alignLeft: String
    
    /** Styles applied to the root element if `align="right"`. */
    var alignRight: String
    
    /** Styles applied to the root element if `variant="body"` or `context.table.body`. */
    var body: String
    
    /** Styles applied to the root element if `variant="footer"` or `context.table.footer`. */
    var footer: String
    
    /** Styles applied to the root element if `variant="head"` or `context.table.head`. */
    var head: String
    
    /** Styles applied to the root element if `padding="checkbox"`. */
    var paddingCheckbox: String
    
    /** Styles applied to the root element if `padding="none"`. */
    var paddingNone: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the root element if `context.table.stickyHeader={true}`. */
    var stickyHeader: String
  }
  object TableCellClasses {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: TableCellClasses] (val x: Self) extends AnyVal {
      
      inline def setAlignCenter(value: String): Self = StObject.set(x, "alignCenter", value.asInstanceOf[js.Any])
      
      inline def setAlignJustify(value: String): Self = StObject.set(x, "alignJustify", value.asInstanceOf[js.Any])
      
      inline def setAlignLeft(value: String): Self = StObject.set(x, "alignLeft", value.asInstanceOf[js.Any])
      
      inline def setAlignRight(value: String): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setPaddingCheckbox(value: String): Self = StObject.set(x, "paddingCheckbox", value.asInstanceOf[js.Any])
      
      inline def setPaddingNone(value: String): Self = StObject.set(x, "paddingNone", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    }
  }
}
