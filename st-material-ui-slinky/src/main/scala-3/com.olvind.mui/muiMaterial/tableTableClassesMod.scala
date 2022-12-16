package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableClassesMod {
  
  @JSImport("@mui/material/Table/tableClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Table/tableClasses", JSImport.Default)
  @js.native
  val default: TableClasses = js.native
  
  inline def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableClassKey = "root" | "stickyHeader"
  
  trait TableClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `stickyHeader={true}`. */
    var stickyHeader: String
  }
  object TableClasses {
    
    inline def apply(root: String, stickyHeader: String): TableClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], stickyHeader = stickyHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    }
  }
}
