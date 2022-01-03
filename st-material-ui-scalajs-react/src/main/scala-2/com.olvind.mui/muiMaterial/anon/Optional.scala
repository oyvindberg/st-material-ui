package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optional extends StObject {
  
  /**
    * Can be a `StepLabel` or a node to place inside `StepLabel` as children.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialStepButtonClasses] = js.native
  
  /**
    * The icon displayed by the step label.
    */
  var icon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The optional node to display.
    */
  var optional: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object Optional {
  
  @scala.inline
  def apply(): Optional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optional]
  }
  
  @scala.inline
  implicit class OptionalMutableBuilder[Self <: Optional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialStepButtonClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value :_*))
    
    @scala.inline
    def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: VdomNode): Self = StObject.set(x, "optional", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setOptionalVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "optional", js.Array(value :_*))
    
    @scala.inline
    def setOptionalVdomElement(value: VdomElement): Self = StObject.set(x, "optional", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
  }
}
