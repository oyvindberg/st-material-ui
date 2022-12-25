package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ComponentC
import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectMod extends Shortcut {
  
  @JSImport("@mui/joy/Select/Select", JSImport.Default)
  @js.native
  val default: SelectComponent = js.native
  
  @js.native
  trait SelectComponent extends StObject {
    
    @JSName("<apply>")
    @scala.annotation.targetName("apply_button")
    def apply[TValue /* <: js.Object */](props: DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]]): Element | Null = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_button")
    def apply[TValue /* <: js.Object */, C /* <: ReactElement */](props: ComponentC[C] & (OverrideProps[SelectTypeMap[TValue, js.Object, "button"], C])): Element | Null = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  type _To = SelectComponent
  
  /* This means you don't have to write `default`, but can instead just say `selectSelectMod.foo` */
  override def _to: SelectComponent = default
}
