package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/TableRow/tableRowClasses.TableRowClasses> */
trait PartialTableRowClasses extends StObject {
  
  var footer: js.UndefOr[String] = js.undefined
  
  var head: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[String] = js.undefined
}
object PartialTableRowClasses {
  
  inline def apply(): PartialTableRowClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableRowClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableRowClasses] (val x: Self) extends AnyVal {
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
