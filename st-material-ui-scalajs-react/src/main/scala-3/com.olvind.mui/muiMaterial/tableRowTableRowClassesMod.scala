package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowTableRowClassesMod {
  
  @JSImport("@mui/material/TableRow/tableRowClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableRow/tableRowClasses", JSImport.Default)
  @js.native
  val default: TableRowClasses = js.native
  
  inline def getTableRowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableRowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableRowClassKey = "root" | "selected" | "hover" | "head" | "footer"
  
  trait TableRowClasses extends StObject {
    
    /** Styles applied to the root element if table variant="footer". */
    var footer: String
    
    /** Styles applied to the root element if table variant="head". */
    var head: String
    
    /** State class applied to the root element if `hover={true}`. */
    var hover: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
  }
  object TableRowClasses {
    
    inline def apply(footer: String, head: String, hover: String, root: String, selected: String): TableRowClasses = {
      val __obj = js.Dynamic.literal(footer = footer.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowClasses] (val x: Self) extends AnyVal {
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
