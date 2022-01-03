package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadClassesMod {
  
  @JSImport("@mui/material/TableHead/tableHeadClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableHead/tableHeadClasses", JSImport.Default)
  @js.native
  val default: TableHeadClasses = js.native
  
  @scala.inline
  def getTableHeadUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableHeadUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableHeadClassKey = root
  
  @js.native
  trait TableHeadClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object TableHeadClasses {
    
    @scala.inline
    def apply(root: String): TableHeadClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeadClasses]
    }
    
    @scala.inline
    implicit class TableHeadClassesMutableBuilder[Self <: TableHeadClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
