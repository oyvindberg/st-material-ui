package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.ltr
import com.olvind.mui.muiBase.muiBaseStrings.rtl
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  def onSelected(e: Any, newValue: Any): Unit = js.native
  
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.native
  
  var value: String | Double | `false` = js.native
}
object Direction {
  
  @scala.inline
  def apply(onSelected: (Any, Any) => Callback, value: String | Double | `false`): Direction = {
    val __obj = js.Dynamic.literal(onSelected = js.Any.fromFunction2((t0: Any, t1: Any) => (onSelected(t0, t1)).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setOnSelected(value: (Any, Any) => Callback): Self = StObject.set(x, "onSelected", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
