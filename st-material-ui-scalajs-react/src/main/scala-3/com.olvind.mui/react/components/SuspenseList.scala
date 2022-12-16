package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder
import com.olvind.mui.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode
import com.olvind.mui.std.Exclude
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuspenseList {
  
  object DirectionalSuspenseListProps {
    
    inline def apply(children: Element | js.Iterable[Element], revealOrder: "forwards" | "backwards"): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]))
    }
    
    @JSImport("react", "SuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def tail(value: SuspenseListTailMode): this.type = set("tail", value.asInstanceOf[js.Any])
    }
    
    def styled: com.olvind.mui.StyledComponent.Builder[
        com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
        Builder
      ] = new com.olvind.mui.StyledComponent.Builder[
        com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
        Builder
      ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
    
    def withProps(p: com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object NonDirectionalSuspenseListProps {
    
    inline def apply(children: Element | js.Iterable[Element]): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]))
    }
    
    @JSImport("react", "SuspenseList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def revealOrder(value: Exclude[SuspenseListRevealOrder, "forwards" | "backwards"]): this.type = set("revealOrder", value.asInstanceOf[js.Any])
    }
    
    def styled: com.olvind.mui.StyledComponent.Builder[
        com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
        Builder
      ] = new com.olvind.mui.StyledComponent.Builder[
        com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
        Builder
      ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
    
    def withProps(p: com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
