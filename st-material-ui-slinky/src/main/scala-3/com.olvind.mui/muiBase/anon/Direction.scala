package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.ltr
import com.olvind.mui.muiBase.muiBaseStrings.rtl
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var idPrefix: js.UndefOr[String] = js.undefined
  
  def onSelected(e: Any, newValue: Any): Unit
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
  
  var value: String | Double | `false`
}
object Direction {
  
  inline def apply(onSelected: (Any, Any) => Unit, value: String | Double | `false`): Direction = {
    val __obj = js.Dynamic.literal(onSelected = js.Any.fromFunction2(onSelected), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    inline def setOnSelected(value: (Any, Any) => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction2(value))
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setValue(value: String | Double | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
