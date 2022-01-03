package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableClassesMod {
  
  @JSImport("@mui/material/Table/tableClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Table/tableClasses", JSImport.Default)
  @js.native
  val default: TableClasses = js.native
  
  @scala.inline
  def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.stickyHeader
  */
  trait TableClassKey extends StObject
  
  @js.native
  trait TableClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `stickyHeader={true}`. */
    var stickyHeader: String = js.native
  }
  object TableClasses {
    
    @scala.inline
    def apply(root: String, stickyHeader: String): TableClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], stickyHeader = stickyHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableClasses]
    }
    
    @scala.inline
    implicit class TableClassesMutableBuilder[Self <: TableClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    }
  }
}
