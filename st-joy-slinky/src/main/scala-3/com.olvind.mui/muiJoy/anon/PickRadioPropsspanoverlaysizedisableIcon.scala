package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioPropsSizeOverrides
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Pick<RadioProps<'span', {}>, 'overlay' | 'size' | 'disableIcon'> & {  orientation :'horizontal' | 'vertical' | undefined,   name :string | undefined,   value :unknown | undefined,   onChange :react.react.ChangeEventHandler<std.HTMLInputElement> | undefined} */
trait PickRadioPropsspanoverlaysizedisableIcon extends StObject {
  
  var disableIcon: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", RadioPropsSizeOverrides]] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object PickRadioPropsspanoverlaysizedisableIcon {
  
  inline def apply(): PickRadioPropsspanoverlaysizedisableIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickRadioPropsspanoverlaysizedisableIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickRadioPropsspanoverlaysizedisableIcon] (val x: Self) extends AnyVal {
    
    inline def setDisableIcon(value: Boolean): Self = StObject.set(x, "disableIcon", value.asInstanceOf[js.Any])
    
    inline def setDisableIconUndefined: Self = StObject.set(x, "disableIcon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", RadioPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
