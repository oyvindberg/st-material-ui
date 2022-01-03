package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.DependencyList
import com.olvind.mui.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEnhancedEffectMod {
  
  @JSImport("@mui/material/utils/useEnhancedEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
