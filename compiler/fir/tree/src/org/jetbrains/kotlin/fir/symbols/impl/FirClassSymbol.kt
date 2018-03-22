/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.symbols.impl

import org.jetbrains.kotlin.fir.declarations.FirClass
import org.jetbrains.kotlin.fir.symbols.AbstractFirBasedSymbol
import org.jetbrains.kotlin.fir.symbols.ConeClassSymbol
import org.jetbrains.kotlin.fir.types.ConeClassLikeType
import org.jetbrains.kotlin.fir.types.coneTypeUnsafe
import org.jetbrains.kotlin.name.ClassId

class FirClassSymbol(override val classId: ClassId) : ConeClassSymbol, AbstractFirBasedSymbol<FirClass>() {
    override val superTypes: List<ConeClassLikeType>
        get() = fir.superTypes.map { it.coneTypeUnsafe<ConeClassLikeType>() }
}