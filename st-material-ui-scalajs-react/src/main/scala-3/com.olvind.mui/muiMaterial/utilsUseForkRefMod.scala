package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.facade.React.RefFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUseForkRefMod {
  
  @JSImport("@mui/material/utils/useForkRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Instance](refs: js.UndefOr[Ref[Instance]]*): RefFn[Instance] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefFn[Instance] | Null]
}
