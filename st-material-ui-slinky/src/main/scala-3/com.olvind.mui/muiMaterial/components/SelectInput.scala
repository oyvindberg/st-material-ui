package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.Node
import com.olvind.mui.muiMaterial.anon.PartialMenuProps
import com.olvind.mui.muiMaterial.selectSelectInputMod.SelectChangeEvent
import com.olvind.mui.muiMaterial.selectSelectInputMod.SelectInputProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSelectElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.select.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectInput {
  
  inline def apply(autoWidth: Boolean, multiple: Boolean, native: Boolean): Builder = {
    val __props = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectInputProps[Any]]))
  }
  
  @JSImport("@mui/material/Select/SelectInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def IconComponent(value: ReactElement): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    
    inline def MenuProps(value: PartialMenuProps): this.type = set("MenuProps", value.asInstanceOf[js.Any])
    
    inline def SelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("SelectDisplayProps", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: /* ref */ HTMLSelectElement | Node[Any] => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: SyntheticFocusEvent[Any] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: (/* event */ SelectChangeEvent[Any], /* child */ ReactElement) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    inline def onClose(value: /* event */ SyntheticEvent[Event, Element] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def onFocus(value: SyntheticFocusEvent[Any] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onOpen(value: /* event */ SyntheticEvent[Event, Element] => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def renderValue(value: /* value */ js.UndefOr[Any] => ReactElement): this.type = set("renderValue", js.Any.fromFunction1(value))
    
    inline def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
    
    inline def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
    
    inline def sxNull: this.type = set("sx", null)
    
    inline def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value*))
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def variant(value: "standard" | "outlined" | "filled"): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  type Props = SelectInputProps[Any]
  
  def styled: com.olvind.mui.StyledComponent.Builder[SelectInputProps[Any], Builder] = new com.olvind.mui.StyledComponent.Builder[SelectInputProps[Any], Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: SelectInputProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
