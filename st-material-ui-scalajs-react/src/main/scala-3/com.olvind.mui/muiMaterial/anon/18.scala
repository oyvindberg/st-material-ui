package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemListItemMod.ListItemComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] & ListItemComponentsPropsOverrides] = js.undefined
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: HTMLAttributes[HTMLDivElement] & ListItemComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
