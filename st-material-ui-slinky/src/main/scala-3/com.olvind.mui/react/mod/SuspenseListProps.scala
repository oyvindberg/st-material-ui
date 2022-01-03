package com.olvind.mui.react.mod

import com.olvind.mui.react.reactStrings.backwards
import com.olvind.mui.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - `com.olvind.mui`.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  inline def DirectionalSuspenseListProps(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: forwards | backwards
  ): com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
  }
  
  inline def NonDirectionalSuspenseListProps(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[com.olvind.mui.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
