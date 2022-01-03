package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelClassesMod {
  
  @JSImport("@mui/material/TableSortLabel/tableSortLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TableSortLabel/tableSortLabelClasses", JSImport.Default)
  @js.native
  val default: TableSortLabelClasses = js.native
  
  @scala.inline
  def getTableSortLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableSortLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.active
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.icon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconDirectionDesc
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconDirectionAsc
  */
  trait TableSortLabelClassKey extends StObject
  
  @js.native
  trait TableSortLabelClasses extends StObject {
    
    /** State class applied to the root element if `active={true}`. */
    var active: String = js.native
    
    /** Styles applied to the icon component. */
    var icon: String = js.native
    
    /** Styles applied to the icon component if `direction="asc"`. */
    var iconDirectionAsc: String = js.native
    
    /** Styles applied to the icon component if `direction="desc"`. */
    var iconDirectionDesc: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object TableSortLabelClasses {
    
    @scala.inline
    def apply(active: String, icon: String, iconDirectionAsc: String, iconDirectionDesc: String, root: String): TableSortLabelClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconDirectionAsc = iconDirectionAsc.asInstanceOf[js.Any], iconDirectionDesc = iconDirectionDesc.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSortLabelClasses]
    }
    
    @scala.inline
    implicit class TableSortLabelClassesMutableBuilder[Self <: TableSortLabelClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDirectionAsc(value: String): Self = StObject.set(x, "iconDirectionAsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDirectionDesc(value: String): Self = StObject.set(x, "iconDirectionDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
